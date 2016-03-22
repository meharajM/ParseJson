import json;
file = open("fashion.json")
data = file.read()
#data = "{'rajkumar':1}";
matches_for_blue = ["black"]
jsonData = json.loads(data.replace("\'", '"'));
id = 3
shirts = jsonData["cloths"]["shirts"]
pants = jsonData["cloths"]["pants"]
color = shirts[str(id)]["color"]
match = []
for i in pants:
	if pants[i]["color"] in matches_for_blue:
		match.append(i)

print match
for i in match:
	print pants[i]


