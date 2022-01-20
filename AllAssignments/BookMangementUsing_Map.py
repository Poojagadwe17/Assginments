#Write a program for book management using map
def insert(map):
    id=input("\nEnter the Id of the Book: ")
    name=input("\nEnter the Name of the Book: ")
    for x in map.keys():
        if(x==id):
            print("\nThe Id already exists in the list!!\n")
            return
    map[id]=name

def remove(map):
    if len(map)==0:
        print("\n its empty")
        return
    id=input("\nEnter the ID of the book to delete: ")
    for x in map.keys():
        if(x==id):
            print(f"\n{map[id]} is removed from the list\n")
            del map[id]
            return
    print("\nEntered Id Does not Exist\n")

def search(map):
    if len(map)==0:
        print("\nits empty...")
        return
    try:
        id=input("\nEnter the Id of the Book to search: ")
        print(f"\nID: {id}\t Name: {map[id]}")
    except:
        print("\nBook Id does not exist ")


def display(map):
    if len(map)==0:
        print("\nThere are no books in the List")
        return
    for y in map.keys():
        print(f"\n{y}\t{map[y]}")

map=dict()
id=0

while(1):
    print("\n1.Insert Book\n2.Remove Book\n3.Display Books\n4.Search\n5.Exit\n\n")
    print("\nEnter your Choice:  ")
    choice=int(input())
    if(choice==1):
        insert(map)
        
    elif(choice==2):
        remove(map)
        
    elif(choice==3):
        display(map)
        
    elif(choice==4):
        search(map)
        
    elif(choice==5):
        break

    else:
        print("\nchoose correct option")