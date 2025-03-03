//String Length
String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
System.out.println("The length of the txt string is: " + txt.length());

//More String Methods
There are many string methods available, for example toUpperCase() and toLowerCase():

String txt = "Hello World";
System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
System.out.println(txt.toLowerCase());   // Outputs "hello world"

//Finding a Character in a String
The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

String txt = "Please locate where 'locate' occurs!";
System.out.println(txt.indexOf("locate")); // Outputs 7
