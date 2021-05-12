#12/05/21
#PPL LAB#7
#Write a Python program to count the number of articles in a given text.

import string

text = input("Enter text: \n")

#removes punctuation
text = text.translate(str.maketrans('', '', string.punctuation))

#converts entered string to lowercase
text = text.lower() 

#split splits the string about " " and returns list of words
word_list = text.split()

print("\nList of words in the given text: ")
print(word_list)

#dictionary to keep track of count of each article in the word_list
articles = {'a':0, 'an':0, 'the':0}

for w in word_list:
    if w in articles.keys():
        articles[w] += 1

print("\nArticles count in the given text: ")
print(articles)

print("\nTotal number of articles in the given text:", sum(articles.values()))

