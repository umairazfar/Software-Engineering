import random

lst = list()

def main():
    Reader("Class1")
    Reader("Class2")
    Reader("Class3")
    Reader("Class4")

def Reader(filename):
    file = open(filename + ".txt", "r")
    txt = file.read()
    file.close()
    lst = txt.split(", ")
    random.shuffle(lst)
    Writer(filename + "_Groups.txt", lst)

def Writer(filename, lst):
    group_size = 8
    num = 0
    file = open(filename, "w")
    if len(lst)%8 == 0:
        group_size = 8
    else:
        group_size = 7
    for i in range(0, len(lst)):
        if i % group_size == 0:
            file.write("\nGroup: " + str(num+1) + str("\n"))
            num+=1
        file.write(lst[i]+"\n")
    file.close()

main()
