# Welcome

This is a basic Codenvy environment for trying out Groovy scripts.

Activation URL: <https://codenvy.com/f?id=ywk05vqoj59g5gyl>

## Running Groovy Scripts
Once the project is opened in Codenvy, you can start a terminal for running
Groovy scripts.

To start the terminal, go the the `Run` menu and select `Run`.
You should see a console section starting up in the lower pane of the IDE -
this is setting up a container with Groovy ready to go.

You can try out Groovy by opening the `Terminal` tab and typing:

    groovy -e "println 'hello, world'"

The project files are accessible in the terminal by changing directory to the
`project` directory:

    cd project

You can then try the demo script:

    groovy hello.groovy

You can start to prepare your own scripts in the IDE by creating new files -
these will be reflected in the `Terminal` under the `project` directory.

## Important notes

The terminal is set to run for 1 hour and will shut-down. If you want to keep
working in the terminal, just start it again using the `Run` menu.

You can change the timing through the `Configs` screen in the `Runners` panel.
Open the `groovy-runner` configuration and edit the line `CMD sleep 1h` to
reflect your desired duration.

Running the terminal will use up you allocated Gigabyte hours. __Make sure you
stop the terminal runner__ when you are not using it and before you close the
IDE.

The Codenvy workspace is temporary and closing the project or browser window
will cause any changes you've made to be lost. If you'd like to keep the
workspace, click on the `Persist` button in the top-right of the IDE.

For help in using Codenvy, please refer to their [User Guide](http://docs.codenvy-stg.com/user/).
