#!/usr/bin/env bash

helm repo add hashicorp https://helm.releases.hashicorp.com
#helm repo update



helm upgrade consul hashicorp/consul \
  --install \
  --namespace=consul \
  --version 0.24.1 \
  -f consul.yaml
