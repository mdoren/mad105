set temperature as variable
ask user for temperature
read user input and set as temperature

if temperature is below 92, print message saying it's low
else if temperature is higher than 104, print message saying it's high
else (which means between 92 and 104 including) pring message saying it's normal

Originally I tried setting else if as a range, like else if (temperature == 92..104) but I don't believe that works with
integers like that, so instead I just made the range of 92 and 104 just be else.
