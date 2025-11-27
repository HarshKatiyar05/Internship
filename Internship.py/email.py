import smtplib
import ssl

from email.message import EmailMessage 

Email = "Harsh_katiyar25@gmail.com"
APP_PASSWORD = "luxq wory dpbm ayam" 
RECEIVER = "sachinshubhamsoni@gmail.com"
msg=EmailMessage()
msg["From"] = Email
msg["To"] = RECEIVER
msg["Subject"] = "HEY USER "

msg.set_content("THIS EMAIL WAS SHARED BY PYTHON CODE........")

context = ssl.create_default_context()

with smtplib.SMTP_SSL("SMTP.gmail.com",465,context=context) as server : 
    server.login(Email,APP_PASSWORD)
    server.send_message(EmailMessage)