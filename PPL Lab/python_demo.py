#Python Demonstration 10/05/21

#1
print('hello')

#2
a, b = 5, 8
c = a + b
print("Result:",c)

#3
a = input('Enter any number: ')
print(a, type(a))

#4
b = input("Enter b: ")
print(b)

#5
def greeting(name):
    print('hello', name)
greeting('John')

#6
def Add2(x, y):
    return x+y

num1 = input("Enter 1st number: ")
num2 = float(input("Enter 2nd number: "))
sum1 = Add2(float(num1), num2)
print('The sum of 1st & 2nd number: ',sum1)

#7
print(range(1,11))
print([a for a in range(1,11)])

#8
n, sum2, i = 10, 0, 1
while i<= n:
    sum2 = sum2 + i
    i = i + 1
print("sum =", sum2)

#9
for a in range(1, 6):
    print(a)

#10
numbers = [6, 6, 9, 9, 5, 2, 11]
sum3 = 0
for val in numbers:
    sum2 = sum3 + val
print('sum3 =',sum3)

#List Operations
#11
list1 = ['physics', "chemistry", 1997, 2000]
list2 = [1, 2, 3, 4, 5]
print(list1, list2)
print("Value at index 2 of list1:",list1[2])
list1[2] = 2001
print("New value at index 2 of list1:",list1[2])
del list1[2]
print("list1 after deleting value at index 2 of list1:",list1)
print('length of list2:', len(list2))

print([1, 2, 3]+[4, 5, 6])
print(['Hi']*4)
print(3 in [1, 2, 3])
for x in [1, 2, 3] : print(x)

L = ['spam', 'Spam', 'SPAM!']
print('L[0]:',L[0])
print('L[-1]:',L[-1])
print('L[2:]:',L[2:])

print(max(list2), min(list2))
print(numbers.count(6))
list2.extend(L)
print(list2)
list2.append("append")
print(list2)
list2.reverse()
print(list2)
numbers.sort()
print(numbers)


