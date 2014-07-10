var taskball = Backbone.Model.extend({
	defaults: {
		"represented_char": "タ",
    		"name": "新しいタスク",
    		"tasks" : [],
    		"color" : "orange",
    		"duetime" : "20:00"
	}
});

var task = Backbone.Model.extend({
	defaults:{
    		"name": "新しいタスク",
    		"parent" : "",
    		"order": 0,
    		"completed": "false"
	}
});

var timeline = Backbone.Model.extend({
	defaults: {
		"start_time": "10:00",
    		"end_time": "20:00",
    		"unit_minutes": "15"
	}
});

var timeseparator = Backbone.Model.extend({
	defaults: {
		"time": "",
    		"use_alert": "true"
	}
});

var fixedevent = Backbone.Model.extend({
	defaults: {
		"name": "meeting",
		"start_time": "10:00",
    		"end_time": "20:00",
    		"place": "somewhere"
	}
}); 

