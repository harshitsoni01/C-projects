print("py\t""thon")
print(3*"un"+"ium")
print("This is cool.")
word = "python data"
number = 1
print (word[0])#this is used to get one character from string
print("The ninth character is '%s'" %word[9])
print(word[-1])
print(word[-2])
print(word[-3])
print(word[-4])
print(word[1:4])#yth this is used to get one or more character from a string #this can also be used for [1,2,3] kind of strings
print(word[:4])#pyth
print(len(word[:4]))#this is used to find the length of the specified string
print("The lenght of the string is '%s'"%len(word))#this can be used to find the length of the string
print("The lenght of PRINT is '%s'"%len("print"))
print(word.index("t"))#2#this is used to find the positon of the character
print(word.index("p"))#0
print(word.count("p"))#counts the nos of specified letters
print("a occurs %d times" % word.count("a"))#occurence of the specified char
print(word[2:5:2])#to  #this will skip 2nd character   #this used for skiping a given no of terms#[start:stop:step]
print(word[2:5:3])#t  #this will 2nd and 3rd character
print("The reverse of the string is '%s'"%word[::-1])#this is used to reverse the string
print("The characters with odd index are '%s'" %word[1::2]) #0-based indexing
print(word.lower())#this is to convert it into lowercase
print(word.upper())#this is t oconvert it into uppercase
print(word.startswith("pyth"))#this will print TRUE#this is used to find if a string starts with a specified string
print(word.startswith("data"))#FALSE
print(word.endswith("data"))#TRUE
words=word.split(" ")#this is used to split a string at the specified character 'here " "' and to make it a list
print(words)
if word=="python data" and number==1:#we can use boolean operators 'and' & 'or'
	print("The word is %s and the number is %d"%(word,number))#which allows to make us to make complex boolean expressions
if number == 1 or number == 2:
	print("The number is either 10 or 20 ")
word1 = "python"
if word1 in words:#this is used to check whether the specified object is in the iterable object container
	print("Your word is either pyhton or data")
print((not False)==(True))#True#NOT is a boolean operator which inverts the expression
if not number:#this can also be use to check if the numbers is 0/1 i.e. true/false
 	print("Number is 1")#this won't print as the number is "not" zero
if number:
	print("The nnumber is 1")#this will print as the number is 1

a,b=3,4
print(a**b/a)#this is used for operations
print(a==3)#True #this is used for checking if the value matches by printing if it's true/false


print("\t\t FIBONACCI SERIES\n")
a,b=0,1
while a<1000:#instead of curly brakets like in c we use "Tab space" indentation(meaning tab space for keeping things in loop/function)
	print(a, end=',')#end=',' is used to put a comma after everything before it
	a,b=b,a+b#this type of equality is used for, demonstrating that the expressions on the right-hand side are all evaluated first before any of the assignments take place. The right-hand side expressions are evaluated from the left to the right.


name = "Harshit "#string
name += "Soni"#adding things in a string
age = 18
college  = "Tsec"
print("\nMy name is %s"% name)
print("\nMy name is %s.And i'm %d.I'm currently studying in %s"%(name, age, college))
mystr=[1,2,3]#string representationn
mystr += [4,5,6]#adding things in a string
print("\n My string is %s"% mystr)
data = ("Harshit", "soni",18, "Tsec")#data representation
string = "\nMy name is %s %s.And I'm %d.I'm currently studying in %s" #string representation
print(string % data)
#Since ** has higher precedence than -, -3**2 will be interpreted as -(3**2) and thus result in -9. To avoid this and get 9, you can use (-3)**2.
print("""\
\n message:this can be used for writing multiple line of string 
		  do you wanna cont?
		  1.yes 2.no
""")#this can be used for mutliple lines of strings

