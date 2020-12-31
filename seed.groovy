pipelineJob("Cart-CI") {
  description('cart')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps51/_git/rs-cart")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}

pipelineJob("Catalogue-CI") {
  description('catalogue')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps51/_git/rs-catalogue")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}

pipelineJob("Terraform-VPC") {
  description('Terraform VPC')
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url("https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps51/_git/terraform-vpc")
          }
          branch("*/master")
        }
      }
      scriptPath("Jenkinsfile")
    }
  }
}