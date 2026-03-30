# A program to test what type of triangle a given triangle is

def is_triangle(a, b, c):
    """Tests whether a given shape qualifes as a triangle.
    
    :param a: length of side a
    :param b: length of side b
    :param c: length of side c
    :return: True if shape qualifies as a triangle,
             False if shape does not qualify as a triangle"""
    if a != 0 and b != 0 and c != 0:
        return a + b >= c and a + c >= b and b + c >= a
    return False


def equilateral(sides):
    """Tests whether a given shape qualifies as an equilateral triangle
    
    :param sides: a list of 3 numbers; numbers represent length of each side
    :return: True if shape qualifies as equilateral,
             False if shape dos not qualify as equilateral"""
    if is_triangle(sides[0], sides[1], sides[2]):
        return sides[0] == sides[1] == sides[2]
    return False


def isosceles(sides):
    """Tests whether a given shape qualifies as an isosceles triangle
    
    :param sides: a list of 3 numbers; numbers represent length of each side
    :return: True if shape qualifies as isosceles,
             False if shape dos not qualify as isosceles"""
    if is_triangle(sides[0], sides[1], sides[2]):
        return sides[0] == sides[1] or sides[1] == sides[2] or sides[0] == sides[2]
    return False


def scalene(sides):
    """Tests whether a given shape qualifies as a scalene triangle
    
    :param sides: a list of 3 numbers; numbers represent length of each side
    :return: True if shape qualifies as scalene,
             False if shape dos not qualify as scalene"""
    if is_triangle(sides[0], sides[1], sides[2]):
        return sides[0] != sides[1] and sides[1] != sides[2] and sides[0] != sides[2]
    return False
