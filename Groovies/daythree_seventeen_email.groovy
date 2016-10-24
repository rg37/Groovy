/* 17 Mail server (*)
Let’s implements part of a mail server. A mail server is a program that takes your emails and then sends them to the appropriate recipient. 
In this exercise, you will implement a simplified version of the SMTP  protocol that is used to send emails over the Internet.
 - Provide a command prompt to the user. 
 - read the return address of the email using a command of the form “MAIL FROM: <email-address>”. 
 - check that the command is properly written and that the email address is valid (i.e. contains one and only one “@” sign which is neither the first nor the last character).
 - If there is an error, the program must say so and wait for a correct return address. 
 - Once the destination is correct, the program must say “OK” and wait for the recipient. 
 - The recipient must be introduced by the user with a command of the form “RCPT FROM: <email-address>”. 
 - Once again, if  the user enters an invalid command or email address, the program must wait for a correct one. 
 - Once the return address and recipient are correct, and only then, the user can enter the command  “DATA”. 
 - The program reads then the body of the email, line after line, until the user enters a line that consists of only a dot. 
 - At that point, the email is ready and the program must write on the screen who is sending the email, to whom, and what the email says. 
 - If at any point the users types “QUIT” the program must terminate. 
 - If the user enters any other command, or types one of these commands at the wrong time (e.g. RCPT before MAIL), the program must say “Invalid command” on screen.
*/

//0. definitions/assignments and methods

String input="", email="";       //to capture user entries for processing. email will be a substring of input
int length = 0;                  //length is for input length
int stage = 0;                   //stage determines which input to accept.
String[] Stage = [               //stage definitions
    'MAIL FROM:',
    'RCPT FROM:',
    'DATA',
    'Email text',
    'QUIT'
]
class EmailData {                //class to hold the email information
    String from;
    String to;
    String data;
}
EmailData emailData = new EmailData(from: "",to: "",data: "");     //initialise empty

String inputType(String input) {	                                  //method to interpret type of input
    if (input.length()>10) {                                       //long enough for email commands
        if (input.substring(0,10)=="MAIL FROM:") {
            return "MAIL";
        } else if (input.substring(0,10)=="RCPT FROM:") {
            return "RCPT";
        } else {
            return "INVALID";
        }
    } else {
        if (input=="DATA") {
            return "DATA";
        } else if (input==".") {
            return "DATA END";
        } else if (input=="QUIT") {
            return "QUIT";
        } else {
            return "INVALID";
        }
    }
}

boolean isValidEmail(String email) {                              //returns true if email is in correct format
    int length = email.length(), countAt = 0;
    if (email[0]=="@" || (email[1]=="@" && email[0]==" ") ||email[length-1]=="@") {
        return false;
    }
    for (int i=1;i<length-1;i++) {                                //this loop is just inner section of email
         if (email[i]=="@") {
             countAt++;
         } else if (email[i]==" ") {
             countAt = 99;
         }
     }
    if (countAt != 1) {                                           //should find one and only 1 @, and no spaces
        return false;
    } else {
        return true;
    }         
}
boolean quitEntered = false;                                      //this signifies when to stop

//1. introduce program
print '''
=========================
=== Rob's Mail Server ===
=========================
''';

//2. run a loop to give command prompts. After each user input, use above methods to check it's ok, and output stuff as necessary

while (!quitEntered) {
    print ">";
    input = System.console().readLine();
    length = input.length();
    if (length>10) {
        email = input.substring(10);
    }
    switch (inputType(input)) {                                   //for each input type need to check correct stage then move to next if all ok.
        case "MAIL":
            if (Stage[stage]!="MAIL FROM:") {
                println "Invalid command, expecting " + Stage[stage] + "<email address>";
            } else if (isValidEmail(email)) {
                println "OK"
                emailData.from = email;
                stage = stage+1;
            } else {
                println "Invalid email: " + email;
            }
            break;
        case "RCPT":
            if (Stage[stage]!="RCPT FROM:") {
                println "Invalid command, expecting " + Stage[stage] + "<email address>";
            } else if (isValidEmail(email)) {
                println "OK"
                emailData.to = email;
                stage = stage+1;
            } else {
                println "Invalid email: " + email;
            }
            break;
        case "DATA":
            if (Stage[stage]!="DATA") {
                println "Invalid command, expecting " + Stage[stage];
            } else {
                stage = stage+1;
            }
            break;
        case "DATA END":
            if (Stage[stage]!="Email text") {
                println "Invalid command: expecting " + Stage[stage];
            } else {
                println "Sending mail...";
                println "from: " + emailData.from;
                println "to: " + emailData.to;
                println emailData.data;
                println "...done"
                stage = 0;                                        //go back to start, will accept another email now.
                emailData.with {                                  //clear old email data
                    from = "";
                    to = "";
                    data = "";
                }
            }
            break;
        case "QUIT":
            println "Bye!"
            quitEntered = true;
            break;
        case "INVALID":
            if (Stage[stage]!="Email text") {
                println "Invalid command, expecting " + Stage[stage];
            } else {
                if (emailData.data=="") {                          //don't need carriage return on first line
                    emailData.data = input;
                } else {
                    emailData.data = emailData.data + "\n" + input;
                }
            }
            break;
        default:
            println "There's a bug, you defaulted :(";
            quitEntered = true;
            break;
    }
}