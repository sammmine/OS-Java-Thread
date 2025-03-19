# OS-Java-Thread

> IF2130 Week 4 Assignment: Implementing Thread in Operating System with Java Program

### Specification:
1. Program has two threads, example: "Process 1" and "Process 2", and an integer flag
2. When a thread is executed, a flag will always be randomly generated between 1-1000 (using Random Class)
3. The program will output the color name with the following conditions:
    - If flag divisible by 3, program will print "merah"
    - If flag divisible by 6, program will print "biru"
    - If flag divisible by 5, program will print "hijau"
    - If flag divisible by 10, program will print "kuning"
    - If flag divisible by 7, program will print "jingga"
    - If flag divisible by 14, program will print "ungu"
    - Other than that, program will print "putih"
4. Add sleep in every output to make the output more visible
5. In the main program, run the two threads

### Example Output:
![Example Output](https://raw.githubusercontent.com/sammmine/OS-Java-Thread/main/example_output.png)