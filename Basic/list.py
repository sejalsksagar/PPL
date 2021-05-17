# Write a Python program that prompts a user to enter a list of words and
# store in another list only those words whose first letter occurs again within the word (e.g. Baboon).
# The program should display resulting list

import pprint
word_list = []

word = input("Enter list of words (0 to stop):\n>>> ")
while(word != '0'):
    word_list.append(word)
    word = input(">>> ")

print("\n--------------------------\n")

print(f"Original List ({len(word_list)} words):\n")
pprint.pprint(word_list, indent=2, compact=True)

print("\n--------------------------\n")

another_list = [ w for w in word_list if w[0] in w[1:]]

print(f"Another List ({len(another_list)} words)\n(containing only those words whose \
first letter occurs again within the word):\n")
pprint.pprint(another_list, indent=2, compact=True)
