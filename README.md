# TDD-String-Calculator

Create a simple String calculator with a method signature:
The method can take up to two numbers, separated by commas, and will return their sum. 
for example “” or “1” or “1,2” as inputs.
(for an empty string it will return 0) 
1.Allow the Add method to handle an unknown amount of numbers
2.Allow the Add method to handle new lines between numbers (instead of commas).
3.Support different delimiters
4.Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed. 
if there are multiple negatives, show all of them in the exception message.
5.Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
6.Delimiters can be of any length with the following format: “//[delimiter]\n”
