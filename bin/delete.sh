#!/bin/sh

kubectl delete -f sts.yaml
kubectl delete -f configmap.yaml
kubectl delete -f pvc.yaml
kubectl delete -f pv.yaml
kubectl delete -f secret.yaml
kubectl delete -f service.yaml
kubectl delete -f namespace.yaml
