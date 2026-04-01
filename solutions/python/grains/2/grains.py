"""Provides functions for calculating the total number of grains on a chessboard,
where each square contains double the number of grains on the previous square."""

def square(number):
    """Return the number of grains on one square.
    
    :param number: the square"""
    if number < 1 or number > 64:
        raise ValueError("square must be between 1 and 64")
    square_grains = 2 ** (number - 1)
    return square_grains
    

def total():
    """Return the total number of grains on the entire chessboard."""
    total_grains = 0
    for n in range(1, 65):
        total_grains += square(n)
    return total_grains
