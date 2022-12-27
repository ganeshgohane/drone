resource "aws_vpc" "mynewvpc" {
  cidr_block       = "172.168.0.0/16"
  instance_tenancy = "default"

 tags = {
    Name = "mynewvpc"
  }
}


provider "aws" {
  region = "us-east-2"
}
