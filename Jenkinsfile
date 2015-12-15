node('hi-speed') {
  stage "Checkout"
  checkout scm

  stage "Build"
  maven "clean verify"
}

def maven(String goals) {
  def javaHome = tool 'oracle-8u66'
  def mvnHome = tool 'maven-3.3.9'

  withEnv(["JAVA_HOME=${javaHome}", "PATH+MAVEN=${mvnHome}/bin"]) {
    sh "mvn ${goals}"
    dir('target') { archive "*.jar" }
  }
}
