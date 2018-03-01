I think there are two stacks now:
- basic-pipeline.yml
    - This is the big excellent stack that validates many projects like gocontainer.
- simple-pipeline.yml
    - This small stack builds/deploys Qoder.war, which writes to CloudWatch.
    - This replaces microcero-pipeline.yml, which was derived from basic-pipeline.yml
        but is deprecated in favor of simple-pipeline.yml.

aws cloudformation create-stack --stack-name wordpress-stack --template-body file://microcero-pipeline.yml --region us-west-2 --capabilities CAPABILITY_NAMED_IAM --parameter ParameterKey=githubpassword,ParameterValue=REDACTED

Seriously, see these two files for more README content:
* See thu04 for create-stack command.
* See test for deletion sequence when testing many of the stack creations.

--
This site is a combination of:
* https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/continuous-delivery-codepipeline-basic-walkthrough.html
* https://github.com/awslabs/codepipeline-nested-cfn
* my stuff

It's not really related to Wordpress (but that first website uses Wordpress for its example).

aws cloudformation create-stack --stack-name sample-Wordpress-pipeline --template-body file://basic-pipeline.yml --region us-west-2 --capabilities CAPABILITY_NAMED_IAM --parameters ParameterKey=PipelineName,ParameterValue=WordPress-test-pipeline ParameterKey=S3Bucket,ParameterValue=redf4rth-root-oregon ParameterKey=SourceS3Key,ParameterValue=wordpress-pipeline/wordpress.zip ParameterKey=Email,ParameterValue=REDACTED ParameterKey=githubpassword,ParameterValue=REDACTED


s/m: Automate my cloud9 startup: https://community.c9.io/t/how-to-auto-configure-workspaces-on-creation/1323/3
