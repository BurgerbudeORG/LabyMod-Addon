<div align="center">
    <h1>LabyMod Addon Template</h1>
</div>
<br>

Click [here](https://discord.burgerbude.org/) to join my discord for support or the official [LabyMod](https://labymod.net/dc/dev) Developer discord!

This template comes with:
* A build.script which implement the LabyGradle plugin
* An example addon

## How to use
1. Clone this repository
2. Open up a command prompt in the folder you have chosen and run `./gradlew setupDecompWorkspace`. <br>
    This might take some time, as it downloads a bunch of artifacts. In the meantime you could drink a cup of cappuccino or do some other stuff you'd like to do.
3. After this process is finished you should choose your IDE:
    * For **Eclipse** we have currently no support right now. :/
    * For **IntelliJ**, you should import the `build.gradle` as a gradle project.
4. After the import, you should execute the following tasks `createLatestVersion` and `getIntelliJRun`.
    * `createLatestVersion` the task download the latest version and make the jar ready.
    * `genIntelliJRun` ths task generate an intellij run configuration with all important stuff to Start *Forge* with LabyMod!
5. Happy coding! :)
