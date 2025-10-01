def call() {
    echo 'Building project...'
    if (fileExists('./gradlew')) {
        sh './gradlew build'
    } else {
        error "Gradle wrapper (./gradlew) not found. Make sure the correct repository is being cloned."
    }
}
