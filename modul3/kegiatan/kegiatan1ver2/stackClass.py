class stack_function :
    top = 0
    size = 0
    stack = [None] * size

    def __init__(self, val):
        self.size = val
        self.stack = [None] * self.size
        self.top = -1

    def empty(self):
        return self.top == -1

    def peek(self):
        return self.stack[self.top]

    def pop(self):
        tmp = self.stack[self.top]
        self.top = self.top - 1
        return tmp

    def push(self, element):
        self.top = self.top + 1
        self.stack[self.top] = element

    def search(self, element):
        for x, y in enumerate(self.stack):
            if(element == y):
                return x
    
        return None