from stack_exceptions import StackUnderflowException

class Stack:

    def __init__(self, elems=[]):
        self.index = len(elems)-1 # Subtracting one for 0-based indexing  
        
        self.structure = [elem for elem in elems] # List comprehension... because it's cool :)  


    def isEmpty(self):
        return self.index == -1  


    def push(self, elem): 
        self.structure.append(elem)
        self.index += 1
    
    
    def pop(self):
        if self.isEmpty():
            raise StackUnderflowException()

        else:
            self.structure = self.structure[:self.index]
            self.index -= 1


    def peekAndRemove(self):
        peeked_data = self.peek()
        self.pop()

        return peeked_data


    def peek(self):
        return self.structure[self.index] 


    def __repr__(self):
        """Visualize the stack through blocks""" 
        containers = "-"
        sides = "| "

        with open("output.txt", "w+") as final_repr:

            # First, we'll add the header
            with open("header.txt", "r") as header:
                final_repr.write(header.read())

            for elem_index in range(len(self.structure)-1, -1, -1): 
                item_length = len(str(self.structure[elem_index]))

                full_representation = """"""
                
                container_amt = containers * item_length + "----"

                full_representation += container_amt # first line 
                full_representation += "\n" + "| " + str(self.structure[elem_index]) + " |" # second line (containing the value)
                full_representation += "\n" + container_amt # final line


                final_repr.write(full_representation + "\n") # make sure the rest of the data is on the next line
            
            
            # Now, we'll add the footer
            with open("footer.txt", "r") as footer:
                final_repr.write(footer.read())

        # We're all ready to go to return 
        final = open("output.txt", "r") 
        return(final.read())
