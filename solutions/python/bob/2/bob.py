def response(hey_bob):
    """Returns one of five responses, based on the str passed to
    hey_bob.
    
    :param hey_bob: the words spoken to Bob,as a str
    :return: Bob's response"""
    
    statement = hey_bob.strip()
    
    if statement.isupper() and statement.endswith('?'):
        return "Calm down, I know what I'm doing!"
    if statement.endswith('?'):
        return 'Sure.'
    if statement.isupper():
        return 'Whoa, chill out!'
    if statement == '':
        return 'Fine. Be that way!'
    else:
        return 'Whatever.'
