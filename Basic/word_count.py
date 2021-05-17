#Write a Python program to find word count in a given text.
import string
from collections import Counter
import pprint

to_find = input("Enter string to find in the file: ")
found = 0

word_counter = Counter()
num_lines = 0

with open("data.txt") as file: 
    for line in file.readlines():
        num_lines += 1
        line = line.strip()
        found += line.count(to_find)
        line = line.lower() #all to lowercase
        line = line.translate(str.maketrans('', '', string.punctuation))#remove punctuation
        words = line.split()
        word_counter += Counter(words)

print("Found",found,"occurrences of '"+to_find+"' in the file.")
print("-----------------------------------------")

print("Number of lines in the file =", num_lines)
print("Number of unique words =",len(word_counter))

print("-----------------------------------------")

top = 10
print(top,"most common words found with their counts: ")
top_list = word_counter.most_common(top)
for i, wc in enumerate(top_list, start = 1):
    print(str(i)+')',wc[0],'-',wc[1])

print("-----------------------------------------")

bottom = 10
print(bottom,"least common words found with their counts: ")
bottom_list = word_counter.most_common()[:-bottom-1:-1]
for i, wc in enumerate(bottom_list, start = 1):
    print(str(i)+')',wc[0],'-',wc[1])

print("-----------------------------------------")
print("**** WORD COUNT DICTIONARY ****")
pprint.pprint(dict(word_counter), indent=4, sort_dicts=True)
