# spring-boot-cicd-demo

## Maven build

```
$ mvn clean package
```

## Docker build

```
$ docker build -t spring-boot-cicd-demo .

$ docker images
REPOSITORY                            TAG                 IMAGE ID            CREATED             SIZE
spring-boot-cicd-demo                 latest              4a412a019f76        8 seconds ago       117MB
```

## Run demo application

Run application with docker image.

```
$ docker run -p 8080:8080 spring-boot-cicd-demo

$ curl localhost:8080
Hello prod application!
```

## Push docker image to your docker registry

```
$ docker tag spring-boot-cicd-demo:[VERSION] [REPOSITORY_ADDRESS]/spring-boot-cicd-demo:[VERSION]

$ docker push [REPOSITORY_ADDRESS]/spring-boot-cicd-demo:[VERSION]
```

## Deploy demo application to Kubernetes cluster

```
$ kubectl apply -f Kubernetes/deployment.yaml

$ kubectl get po
NAME                                     READY     STATUS    RESTARTS   AGE
spring-boot-cicd-demo-5b67cc9997-2pzp7   1/1       Running   0          1m
spring-boot-cicd-demo-5b67cc9997-2tc5t   1/1       Running   0          1m
spring-boot-cicd-demo-5b67cc9997-d5pz6   1/1       Running   0          1m
spring-boot-cicd-demo-5b67cc9997-gqqh8   1/1       Running   0          1m
spring-boot-cicd-demo-5b67cc9997-zvvqw   1/1       Running   0          1m
```
