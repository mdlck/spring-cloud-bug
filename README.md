# What and Why

This project is an example for Spring Cloud not decrypting all secrets when there is an environmental variable name with "_" instead of ".".

You can try it out by starting the JUnit-Test (SpringCloudBugApplicationTests) with the following Environmental Variables:

CONFIGPROPS.MAP.VAR3ENCRYPTED={cipher}9f209f133478741f81ad3fbe2bc88325b9a3c3998bffdae73b89755ec7727bc6
CONFIGPROPS.MAP.VAR3RAW=test1
CONFIGPROPS.VAR3ENCRYPTED={cipher}9f209f133478741f81ad3fbe2bc88325b9a3c3998bffdae73b89755ec7727bc6
CONFIGPROPS.VAR3RAW=test1
CONFIGPROPS_MAP_VAR2ENCRYPTED={cipher}9f209f133478741f81ad3fbe2bc88325b9a3c3998bffdae73b89755ec7727bc6
CONFIGPROPS_MAP_VAR2RAW=test1
CONFIGPROPS_VAR2ENCRYPTED={cipher}9f209f133478741f81ad3fbe2bc88325b9a3c3998bffdae73b89755ec7727bc6
CONFIGPROPS_VAR2RAW=test1
ENCRYPT_KEY=8783598d35c3eb1ea194c4b53b6127ad879e04893b85187c66e9636497e58a64

The application.yaml-Property is properly decrypted, as well as the environmental variable with ".", but not the environmental variable with "_" (CONFIGPROPS_VAR2ENCRYPTED).