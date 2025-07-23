# APITEST
   This is a Rest API service built with Spring Boot 3.3.9 and saving user into a PostgreSQL table (`sso_user_test`). The API testable in Swangger UI.

   ---

   ## Technologies Used

   - Java 21
   - Spring Boot 3.3.9
   - Spring Web
   - PostgreSQL
   - Swagger
   - Maven

   ## Installing
   - install Oracle JDK 21
   - install Apache Maven 3.9.11
   - install Postgres 15 for used Database
   - install IntelliJ IDEA for Run Code
```
  ## Project Structure
   APITEST/
|---apiTest/
|      |--src/
|        |--main/
|            |--java/
|               |--com/example/apitest/
|                  |--ApiTestApplication.java
|                  |--controller/
|                     |--controller.java
|                  |--dto/
|                     |--SsoResponse.java
|                     |--SsoUserModel.java
|                  |--entity/
|                     |--SsoEntity.java
|                  |--repository/
|                     |--SsoRepository.java
|                  |--service/
|                     |--SsoService.java
|   |--pom.xml
|   |--.gitignore
```    
## How to Run
  1. Open Project in IntelliJ IDEA
  2. Run Project
  3. Open link Swagger http://localhost:8080/apitest/swagger-ui.html
  4. Choose gentoken
  5. Click try it out
  6. Test Project with samples request this
     ```
     {
        "ssoType": "SSOData",
        "systemId": "VATDEDEV",
        "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ)",
        "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
        "systemPrivileges": "0|0|0|0",
        "systemUserGroup": "GRP-010,GRP-020,GRP-040",
        "systemLocationGroup": "CliC001",
        "userId": "WS233999",
        "userFullName": "ประสาท จันทร์อังคาร ",
        "userRdOfficeCode": "01000999",
        "userOfficeCode": "01001139",
        "clientLocation": "01001139",
        "locationMachineNumber": "CLI00000718-9999",
        "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
     }
     ```
  7. Click Execute
  8. Check Response


## Thank You Have A Good Day🌤️


