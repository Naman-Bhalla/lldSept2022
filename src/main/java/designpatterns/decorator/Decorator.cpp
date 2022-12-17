#include <iostream>
using namespace std;


class Pizza
{
	public :
		virtual int cost() = 0;
		virtual string description() = 0;
		
		virtual ~Pizza()
		{
			
		}
};

class Farmhouse : public Pizza
{
	public:
		virtual int cost()
		{
			return 150;
		}
		
		virtual string description()
		{
			return "Farmhouse";
		}
	
};

class Margherita : public Pizza
{
	public:
		virtual int cost()
		{
			return 200;
		}
		
		virtual string description()
		{
			return "Margherita";
		}
	
};

class Pepperoni : public Pizza
{
	public:
		virtual int cost()
		{
			return 180;
		}
		
		virtual string description()
		{
			return "Pepperoni";
		}
	
};

class BBQChicken : public Pizza
{
	public:
		virtual int cost()
		{
			return 200;
		}
		
		virtual string description()
		{
			return "BBQChicken";
		}
	
};

class ToppingDecorator : public Pizza
{

};

class cheezeTopping : public ToppingDecorator
{
	Pizza& m_pizza;
	
	public:
		cheezeTopping(Pizza& pizza):m_pizza(pizza)
		{
		}
		
		virtual int cost()
		{
			return m_pizza.cost() + 80;
		}
		
		virtual string description()
		{
			return m_pizza.description() + "  Cheeze";
		}
		
};

class OliveTopping : public ToppingDecorator
{
	Pizza& m_pizza;
	
	public:
		OliveTopping(Pizza& pizza):m_pizza(pizza)
		{
		}
		
		virtual int cost()
		{
			return m_pizza.cost() + 20;
		}
		
		virtual string description()
		{
			return m_pizza.description() + "  Olive";
		}
};

class TomatoTopping : public ToppingDecorator
{
	Pizza& m_pizza;
	
	public:
		TomatoTopping(Pizza& pizza):m_pizza(pizza)
		{
		}
		
		virtual int cost()
		{
			return m_pizza.cost() + 30;
		}
		
		virtual string description()
		{
			return m_pizza.description() + "  Tomato";
		}
};

class PaneerTopping : public ToppingDecorator
{
	Pizza& m_pizza;
	
	public:
		PaneerTopping(Pizza& pizza):m_pizza(pizza)
		{
		}
		
		virtual int cost()
		{
			return m_pizza.cost() + 60;
		}
		
		virtual string description()
		{
			return m_pizza.description() + "  Paneer";
		}
};




int main() {
	// your code goes here
	
	Pizza *p = new PaneerTopping(*(new cheezeTopping(*(new TomatoTopping(*(new BBQChicken()))))));
	cout << p->cost() << endl;
	cout << p->description();
	
	return 0;
} 
