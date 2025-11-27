from gtts import gTTS
import os
language="en"
while True:
    text=input("Provide any text: ")
    ai=gTTS(text,lang=language,slow=True)
    ai.save("ouput.mp3")
    os.system("start output.mp3")
