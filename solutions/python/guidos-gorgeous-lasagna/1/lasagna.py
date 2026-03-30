"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language:
https://en.wikipedia.org/wiki/Guido_van_Rossum

This is a module docstring, used to describe the functionality
of a module and its functions and/or classes.
"""

EXPECTED_BAKE_TIME = 40    # total time lasagna should be in the oven
PREPARATION_TIME = 2       # the time it takes to prepare one layer

def bake_time_remaining(elapsed_bake_time):
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """
    return EXPECTED_BAKE_TIME - elapsed_bake_time
    
# To avoid the use of magic numbers (see: https://en.wikipedia.org/wiki/Magic_number_(programming)), you should define a PREPARATION_TIME constant.
# You can do that on the line below the 'EXPECTED_BAKE_TIME' constant.
# This will make it easier to do calculations, and make changes to your code.
def preparation_time_in_minutes(number_of_layers):
    """Calculate the preparation time.
    
    :param number_of_layers: int - number of layers being prepared.
    :return: int - the time required to prepare all layers.

    Function that takes the desired number of layers in the lasagna as an
    argument and returns how much time is required to prepare all of the
    layers based on the `PREPARATION_TIME`.
    """
    return number_of_layers * PREPARATION_TIME

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """Calculate the total time spent in the kitchen.

    :param number_of_layers: int - the number of layers in the lasagna.
    :param elapsed_bake_time: int - the number of minutes the lasagna has been
    in the oven.
    :return: int - the total number of minutes spent in the kithen.

    Function that takes the number of layers in the lasagna and the time the
    lasagna has been baking as arguments and returns how much time has been
    spent on the lasagna so far, by passing the number of layers to a
    preparation_time_in_minutes() call and adding the result to the elapsed
    bake time.
    """
    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time


print(bake_time_remaining(20))
print(preparation_time_in_minutes(4))
print(elapsed_time_in_minutes(4, 20))
