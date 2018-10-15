# sample-web demo app

Simple java rest service application to test cicd process

## App build

```shell
gradle clean build
```

## App unit test

```shell
gradle test
```

## Code coverage [Optional, needs to config in gradle build file]

```shell
gradle JacocoTestReport jacocoTestCoverageVerification
```

## Docker build

```shell
docker build -t sample-web .
```

## Docker run

```shell
docker run -it --rm -p 8888:8080 sample-web
```

## Sample API

<http://localhost:8888/sample-web/api/v1/hello>
<http://localhost:8888/sample-web/api/v1/echo?m=helloworld>