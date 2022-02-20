### Make Change Project

#### Description
This program is designed to issue change back to the user after making a purchase. Listing out  
#### Lessons Learned
The modulus command cannot compile decimals, this was proven difficult for returning change, but after a simple conversion, the code was able to compile with no system errors.

Also when trying to get change in pennies, the modulus would return a decimal like 1.9, so switching the modulus from a double to an int in the final steps was not a component I though about until I realized my program was trying to short change my customers. 
#### Technologies Used
Operations, Scanners, System outputs, if statements, and conversions from double to int.
