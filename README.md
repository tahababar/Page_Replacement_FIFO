# Page_Replacement_FIFO
Implementation of a page replacing algorithm

Project Instructions:
For this assignment, you will be writing a simulator to test a page replacement algorithm (FIFO). 

Your program should behave in the following manner:
•	Welcome the user to your program, and inform the user of your algorithm.
•	Prompt the user to enter how many pages the process will have in its virtual memory.
•	Prompt the user to choose how many frames of physical memory are allocated.
•	Prompt the user to indicate how many page references they would like to simulate.
•	Generate a random sequence of page references of the desired length. You do not need to worry about repeated references for this sequence.
•	Simulate your algorithm on the sequence of page references.
•	Report the number of page faults generated during the simulation, as a number and as a percentage of total page references. 

An example of running your program might look like this:

Welcome to the simulator! We are using the FIFO algorithm.
How many virtual pages are in the process: 50
How many frames are allocated to the process: 20
How many page references would you like to simulate: 1000
The algorithm produced 247 page faults, or 24.7%.

When generating your sequence of page references, simply generate a random page number for each page reference – use the number of virtual pages to randomly select a number. You do not need to generate the entire sequence ahead of time – it would probably be easier to handle each page as it is generated.

