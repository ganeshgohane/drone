   provider "aws" {
    region = "us-east-2"
}
   resource "aws_instance" "GANESH" {
     ami = "ami-0a606d8395a538502"
     instance_type = "t2.micro"
     security_groups_id = "sg-04063eead5c30d326"
     key_name = "GanesAAA"
 }

