def leap_year(year):
    """Tests whether a given year qualifies as a leap year.
    
    :param year: the year being tested
    :return: True if the year qualifies as a leap year,
    False if the year does not qualify as a leap year"""
    if year % 4 == 0 and year % 100 != 0:
        return True
    if year % 400 == 0:
        return True
    return False