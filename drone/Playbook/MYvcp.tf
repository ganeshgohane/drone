resource "aws_vpc" "mynewvpc" {
  cidr_block       = "172.168.0.0/16"
  instance_tenancy = "default"
  region_name = "us_east_2"

  tags = {
    Name = "mynewvpc"
  }
}