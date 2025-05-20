# Spring-Boot-Sending-Email

### curl for sending simple mail

<code>
curl --location 'http://localhost:8080/send' \
--header 'Content-Type: application/json' \
--data-raw '{
    "recipient": "test@gmail.com",
    "msgBody": "This is a test messgage",
    "subject": "Test Message"
}'
</code>

### curl for sending mail with attachment
<code>
curl --location 'http://localhost:8080/sendWithAttachment' \
--header 'Content-Type: application/json' \
--data-raw '{
    "recipient": "test@gmail.com",
    "msgBody": "This is a test messgage with attachment",
    "subject": "Test Message with Attachment",
    "attachment": "D:/Projects/java-mail-service/src/main/resources/static/dipdeveloper.png"
}'
</code>
