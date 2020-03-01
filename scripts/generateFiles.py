import random

def main ():
    f_data = open("./data/data.txt", 'r')
    data = f_data.readlines()
    
    f_full = open("./data/test_n_2976.txt", "w")
    
    for line in data:
        f_full.write(line)
    
    f_full.close()
    
    for n in range(276, 2655, 296):
    
        f_n = open("./data/test"+"_n_"+str(n)+".txt", 'w')
        indeces = random.sample(range(2976), n)
        
        for index in indeces:
            f_n.write(data[index])
        
        f_n.close()    
    
    f_data.close()    
    

if __name__ == "__main__":
    main()