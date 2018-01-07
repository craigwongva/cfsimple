This site is a combination of:
* https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-basic-walkthrough.html
* https://github.com/awslabs/codepipeline-nested-cfn
* my stuff

It's not really related to Wordpress (but that first website uses Wordpress for its example).

aws cloudformation create-stack --stack-name sample-Wordpress-pipeline --template-body file://basic-pipeline.yml --region us-west-2 --capabilities CAPABILITY_NAMED_IAM --parameters ParameterKey=PipelineName,ParameterValue=WordPress-test-pipeline ParameterKey=S3Bucket,ParameterValue=redf4rth-root-oregon ParameterKey=SourceS3Key,ParameterValue=wordpress-pipeline/wordpress.zip ParameterKey=Email,ParameterValue=REDACTED ParameterKey=githubpassword,ParameterValue=REDACTED
