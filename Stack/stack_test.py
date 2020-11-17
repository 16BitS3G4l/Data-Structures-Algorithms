from stack import Stack 
from stack_exceptions import StackUnderflowException 
import unittest 

class Stack_Tests(unittest.TestCase):

    def test_StackIsEmpty(self):
        stack = Stack()

        self.assertTrue(stack.isEmpty())
    

    def test_peekShowsFirstElement(self):
        stack = Stack([45, 33, 22, 11])

        self.assertEquals(11, stack.peek())


    def test_peekAndRemoveGetsRidOfFirstElementAfterPeeking(self):
        stack = Stack([32, 44, 55, 66, 92, 110])

        first_elem = stack.peek()
        next_elem = stack.peekAndRemove()

        self.assertEquals(first_elem, next_elem)


    def test_peekAndRemoveDeletesFirstElementAndShiftsStack(self):
        stack = Stack([45, 92, 11])

        first_elem = stack.peek()
        second_to_first_element = stack.structure[stack.index-1]

        stack.peekAndRemove() 
        """ We could just call the pop() method, but since I want to make sure
        that we're not tripping over our feet here, I'd rather we simulate it
        as closely as possible to the real deal."""
        
        self.assertEquals(stack.peek(), second_to_first_element)


    def test_StackThrowsUnderflowExceptionWhenEmptyAndCallingPop(self):
        stack = Stack() # establish an empty stack 

        self.assertRaises(StackUnderflowException, lambda:stack.pop())


    
if __name__ == "__main__":
    unittest.main()