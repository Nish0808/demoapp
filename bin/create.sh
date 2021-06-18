#!/bin/sh

kubectl create -f namespace.yaml 
kubectl create -f configmap.yaml
kubectl create -f pv.yaml 
kubectl create -f pvc.yaml
kubectl create -f secret.yaml
kubectl create -f sts.yaml
kubectl create -f service.yaml
