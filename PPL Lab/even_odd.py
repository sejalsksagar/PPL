'''
PPL LAB#6 11/05/2021
SEJAL KSHIRSAGAR 2372
Write a program in Python using functional paradigm for generating
two sub-lists of even and odd numbers from given list. Perform
addition of individual sub-list and display the result
'''

import pprint

def print_list(list_to_print):
    pprint.pprint(list_to_print, indent=2, compact=True)

given_list = list(map(int, input("Enter a list of numbers: ").split()))
print("\n------------------\n")


print("Given List: ")
print_list(given_list)
print("Given list Sum =", sum(given_list))
print("\n------------------\n")


def even_odd(given_list):
    odd_list = list(filter(lambda n: n%2 != 0, given_list))
    print("Sub-list containing Odd Numbers:")
    print_list(odd_list)
    print("Odd number list Sum =", sum(odd_list))
    print("\n------------------\n")

    even_list = list(filter(lambda n: n%2 == 0, given_list))
    print("Sub-list containing Even Numbers:")
    print_list(even_list)
    print("Even number list Sum =", sum(even_list))


even_odd(given_list)
