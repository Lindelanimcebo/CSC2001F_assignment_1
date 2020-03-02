import os
import subprocess
import numpy as np
#import pandas as pd

def main ():

    #os.system('make clean')
    #os.system('make')
    
    for i in range(276, 2655, 296):
        
        file_name = './data/test_n_'+str(i)+'.txt'
        file = open( file_name , 'r' ); 
        
        for line in file:
        
            command = 'java -cp bin LSArrayApp '+stage(line)+' '+day(line)+' '+time(line)+' '+file_name
            print(command)
            output =  os.system(command)
            print(output)


def stage(line):
    return line[0]

def day(line):
    return line[2 : line.rindex('_')]

def time(line):
    rindex = line.rindex('_')
    return line[ rindex + 1 : rindex+3]
