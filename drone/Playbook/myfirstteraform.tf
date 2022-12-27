   provide "aws" {
    region = "us-east-2"
}
   resource  "aws_instance" "web_server" {
     ami = "ami-0a606d8395a538502"
     instance_type = "t2.micro"
     security_group = ["default"]
     key_name = "GanesAAA"
 }
