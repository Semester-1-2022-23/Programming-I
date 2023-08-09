
public class Tree {
	int head;
	Tree left, middle, right;
	
	void insert(int elt){
		if(elt < head){
			if(left == null){
				left = new Tree();
				left.head = elt;
			}
			else{
				left.insert(elt);
			}
		}
		else if(elt < head * head){
			if(middle == null){
				middle = new Tree();
				middle.head = elt;
			}
			else{
				middle.insert(elt);
			}
		}
		else {
			if(right == null){
				right = new Tree();
				right.head = elt;
			}
			else{
				right.insert(elt);
			}
		}
	}

	}