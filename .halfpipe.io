team: workshop
pipeline: michaels-java-app
tasks:
- type: run
  name: build app
  script: ./mvnw clean install
  save_artifacts:
  - target
  docker:
    image: openjdk:8-jdk-slim

- type: deploy-cf
  name: deploy app
  api: ((cloudfoundry.api-snpaas))
  space: dev
  deploy_artifact: target/demo-0.0.1-SNAPSHOT.jar