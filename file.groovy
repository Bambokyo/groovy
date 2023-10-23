def deployToEnvironment(environment) {
    if (environment == 'PROD') {
        println("Deploying to production")
    } else {
        println("Deploying to testing")
    }
}
return this
