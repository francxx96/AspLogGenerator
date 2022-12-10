package declare.constraint;

import declare.constraint.condition.Predicate;
import declare.constraint.condition.TimeCondition;
import declare.core.Activity;
import declare.core.Template;

public class UnaryConstraint extends Constraint {

	public UnaryConstraint(Template template, Activity activation, Predicate activationCond, TimeCondition timeCond) {
		super(template, activation, activationCond, timeCond);
	}
	
	@Override
	public String toString() {
		return this.getTemplate() + "[" + this.getActivation().getName() + "]"
				+ " |" + this.getActivationCond() 
				+ " |" + (this.getTimeCond()==null ? "" : this.getTimeCond().toString());
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}
}
