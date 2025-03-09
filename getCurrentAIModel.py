import datetime
# Get the current date

def current_ai_model(deepseek):
    current_date = datetime.datetime.now().date()

    # Define the date after which the model should be set to "gpt-3.5-turbo"
    target_date = datetime.date(2025, 3, 8)

    if deepseek:
        return "deepseek/deepseek-r1:free"

    # Set the model variable based on the current date
    if current_date > target_date:
        llm_model = "gpt-3.5-turbo"
    else:
        # llm_model = "gpt-3.5-turbo"
        llm_model = "gpt-4o"
    print(llm_model)
    return llm_model

current_ai_model()



