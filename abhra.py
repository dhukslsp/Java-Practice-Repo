i = 0
j=0
while i<10:
	while j < i:
		j+=1
		print(str(i), end = " ")
	print("\r")
	j=0
	i+=1
