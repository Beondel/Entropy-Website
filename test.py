import numpy as np

text = """
     aA
"""

def entropy(text):
    charArray = list(text.replace(" ", ""))
    data = [ord(i) for i in charArray]

    prob_dict = {x:data.count(x)/len(data) for x in data}
    probs = np.array(list(prob_dict.values()))

    return -probs.dot(np.log2(probs))

print(entropy(text))
